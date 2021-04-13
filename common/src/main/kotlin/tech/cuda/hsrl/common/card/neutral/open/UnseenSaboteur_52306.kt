package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnseenSaboteur_52306 : Card() {
    override val id = 52306
    override val name = "隐秘破坏者"
    override val description = "<b>战吼：</b> 随机使你的对手从手牌中施放一个法术<i>（目标随机而定）</i>。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我应该在车里，不应该在车底。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5c5f9c84e0053656bf008ad519ea6d33607eb9fc855050c11603d62eb3c342f.png"
}
