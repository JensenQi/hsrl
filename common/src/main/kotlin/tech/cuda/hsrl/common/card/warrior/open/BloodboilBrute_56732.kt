package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodboilBrute_56732 : Card() {
    override val id = 56732
    override val name = "沸血蛮兵"
    override val description = "<b>突袭</b> 每有一个受伤的随从，该牌的法力值消耗减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "你大可以将古尔图格称为蛮兵。但明明没有人会像他这样关心伤员。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee7247cd17276de754e714dbe705fc970336449042bfd8a28fce030451366262.png"
}
