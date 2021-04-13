package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EliteTaurenChieftain_68550 : Card() {
    override val id = 68550
    override val name = "精英牛头人酋长"
    override val description = "<b>战吼：</b>让两位玩家都具有摇滚的能力！（双方各获得一张强力和弦牌）"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他正在物色一名鼓手。目前的候选人包括：工程师学徒，森金持盾卫士，还有炎魔之王拉格纳罗斯。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dfd2d7099b96133ef8ea92bbaf8d0c59be01a0fb6e07f9b0fb78539f0fca07c9.png"
}
