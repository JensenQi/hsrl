package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeaforiumBomber_48753 : Card() {
    override val id = 48753
    override val name = "爆盐投弹手"
    override val description = "<b>战吼：</b>将一张“炸弹” 牌洗入你对手的牌库。当玩家抽到“炸弹”时，便会受到5点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "穿爱穿的衣服，炸爱炸的坏蛋。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/55917ba0bc93d81b7575973577333b873ebafb088c8ea5b903ff61cca6daed5f.png"
}
