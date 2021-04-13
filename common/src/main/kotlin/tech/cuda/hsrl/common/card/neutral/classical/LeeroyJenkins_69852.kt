package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeeroyJenkins_69852 : Card() {
    override val id = 69852
    override val name = "火车王里诺艾"
    override val description = "<b>冲锋，战吼：</b> 为你的对手召唤两条1/1的雏龙。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "至少他还有愤怒的小鸡。"
    override val artist = "Gabe from Penny Arcade"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab8e9a979e54e962b030998d1e6bdaa6bdf3498491e8af9519b1740c2097d38d.png"
}
