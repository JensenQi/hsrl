package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TourGuide_59035 : Card() {
    override val id = 59035
    override val name = "巡游向导"
    override val description = "<b>战吼：</b> 你的下一个英雄技能的法力值消耗为（0）点。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“请看，这是学园的原始设计图！别在意什么所谓的小黑屋……那是旅途的终点。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c58e6de92145482950097e1861aea8a90e77ba7da3f85217326293db3f18f59e.png"
}
