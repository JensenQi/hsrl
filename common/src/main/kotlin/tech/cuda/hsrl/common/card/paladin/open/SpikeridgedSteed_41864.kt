package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpikeridgedSteed_41864 : Card() {
    override val id = 41864
    override val name = "剑龙骑术"
    override val description = "使一个随从获得+2/+6和<b>嘲讽</b>。当该随从死亡时，召唤一个剑龙。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "恐龙骑士唯一的遗憾，就是没能参加“冠军的试炼”。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ef54bf6457b59d3967ead57a0865b3b9f3002fd1afb2fe30be23e74d3a161a1.png"
}
