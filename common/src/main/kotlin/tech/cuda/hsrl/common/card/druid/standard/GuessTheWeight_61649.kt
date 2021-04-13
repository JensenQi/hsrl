package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuessTheWeight_61649 : Card() {
    override val id = 61649
    override val name = "猜重量"
    override val description = "抽一张牌。猜中你下一张牌的法力值消耗更大或更小，则可抽取下一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“等报出结果的那一刻，我就变成猎豹形态！”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e717542b80b6fdf702a49f9f086aede75d579560402c04ecfe2a3bb37edc63f9.png"
}
