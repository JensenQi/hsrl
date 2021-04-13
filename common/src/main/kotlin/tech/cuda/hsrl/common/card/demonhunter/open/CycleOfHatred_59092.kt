package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CycleOfHatred_59092 : Card() {
    override val id = 59092
    override val name = "仇恨之轮"
    override val description = "对所有随从造成 3点伤害。每消灭一个随从，召唤一个3/3的怨魂。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "用两张仇恨之轮，能不能组成一辆仇恨之自行车？"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5049804d5683a024cd5b0db4dfad87d2183050e8d9cfe2fba3fbe64ba9b7201.png"
}
