package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brainstormer_48544 : Card() {
    override val id = 48544
    override val name = "脑力激荡者"
    override val description = "<b>战吼：</b>你手牌中每有一张法术牌，便获得+1生命值。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她天生一副爆炸头。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/45df9d8cf0ad1ec0c68b6dd89e639cdbc3f7b627e4bf80dc5d5e3775eee19e5d.png"
}
