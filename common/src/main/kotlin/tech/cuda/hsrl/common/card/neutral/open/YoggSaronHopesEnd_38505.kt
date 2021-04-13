package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YoggSaronHopesEnd_38505 : Card() {
    override val id = 38505
    override val name = "尤格-萨隆"
    override val description = "<b>战吼：</b> 在本局对战中，你每施放过一个法术，便随机施放一个法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 10
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "你死期到了……死期到了……期到了……到了……了！"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1d2867a0b75967bd0519d09ff70202b51fa7805d05cca54683570dd5c8ea400.png"
}
