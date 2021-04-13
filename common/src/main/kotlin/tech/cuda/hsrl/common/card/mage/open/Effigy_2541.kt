package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Effigy_2541 : Card() {
    override val id = 2541
    override val name = "轮回"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，随机召唤一个法力值消耗相同的随从。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "生死往复，六道轮回。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c964f18427430e1b986d8740402ef6b70a93578c36c91a6faf9d4a3aa6548a24.png"
}
