package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrowdRoaster_51816 : Card() {
    override val id = 51816
    override val name = "看台喷火龙"
    override val description = "<b>战吼：</b> 如果你的手牌中有龙牌，则对一个敌方随从造成7点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "重要赛事前总要有人暖场。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a33efb7f9714b2473a98e037596e12926e3c768cd4be72909206a078e2f4feb8.png"
}
