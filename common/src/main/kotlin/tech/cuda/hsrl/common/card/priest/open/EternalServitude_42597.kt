package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EternalServitude_42597 : Card() {
    override val id = 42597
    override val name = "永恒奴役"
    override val description = "<b>发现</b>一个在本局对战中死亡的友方随从，并召唤该随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "加班还有加班费？不存在的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b64a3a06bcf5f7be9c77a9f0619737aa048ad1fc2a2608b04ed187c1db18e63.png"
}
