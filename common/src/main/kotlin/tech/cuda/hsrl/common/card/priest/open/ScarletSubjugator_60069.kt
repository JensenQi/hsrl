package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarletSubjugator_60069 : Card() {
    override val id = 60069
    override val name = "血色征服者"
    override val description = "<b>战吼：</b>直到你的下个回合，使一个敌方随从获得-2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "在血色修道院，他学到了遇强则强的神圣战术。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d529431cbb8849ef70a4564706e0f6b9d216ce1e2c3c74f01e4724f40f7e8f8.png"
}
