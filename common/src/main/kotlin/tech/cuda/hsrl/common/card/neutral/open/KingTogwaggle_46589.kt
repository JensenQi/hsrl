package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingTogwaggle_46589 : Card() {
    override val id = 46589
    override val name = "托瓦格尔国王"
    override val description = "<b>战吼：</b>与你的对手交换牌库。你的对手获得一张“赎金”法术牌，可以将牌库交换回来。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "要想管理好狗头人帝国，就必须在缺乏同情心和缺少社会责任感之间找到平衡。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cc7bb617378d8ceaf6c84618fb6166a7337de2d35206d59f6a354e31544bcfd.png"
}
