package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneGolem_69841 : Card() {
    override val id = 69841
    override val name = "奥术傀儡"
    override val description = "<b>冲锋</b>，<b>战吼：</b>使你的对手获得一个法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果家里有一台奥术傀儡的话，一定能够使房间蓬荜生辉，格调提高，而且，它们还能成为不错的谈资。"
    override val artist = "Sedhayu Ardian"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9949ca5785cde9252b9e79068d27af6fcb6c29d309686be1fa67c51269f494b2.png"
}
