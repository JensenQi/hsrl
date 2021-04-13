package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BookWyrm_39210 : Card() {
    override val id = 39210
    override val name = "书卷之龙"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则消灭一个攻击力小于或等于3的敌方随从。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "他最喜欢中古奇幻类的书籍，例如《戒指王》和《霜与火之歌》。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d49cbaedd428e7df3fa1366aa07d57b80b282734b4871230b9913ba9121f738c.png"
}
