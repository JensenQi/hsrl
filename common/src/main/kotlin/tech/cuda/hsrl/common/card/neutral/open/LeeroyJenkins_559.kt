package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeeroyJenkins_559 : Card() {
    override val id = 559
    override val name = "火车王里诺艾"
    override val description = "<b>冲锋，战吼：</b> 为你的对手召唤两条1/1的雏龙。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "至少他还有愤怒的小鸡。"
    override val artist = "Gabe from Penny Arcade"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/444ad4df1e8445061c1e7ef64342c5e9006f256af231154279cdd76f74e48780.png"
}
