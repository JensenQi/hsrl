package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneTyrant_43483 : Card() {
    override val id = 43483
    override val name = "奥术统御者"
    override val description = "在本回合中，如果你施放过法力值消耗大于或等于（5）的法术，则这张牌的法力值消耗为（0）点。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他其实并不想当什么统御者，做做木工或者修修表才是他的最爱。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0dbfdb2825d570cea52e9f67a54df42534b25f8ec4fedca292e4ec1143aaf3e7.png"
}
