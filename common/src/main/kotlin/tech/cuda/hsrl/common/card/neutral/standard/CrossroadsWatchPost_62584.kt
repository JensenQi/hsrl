package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrossroadsWatchPost_62584 : Card() {
    override val id = 62584
    override val name = "十字路口哨所"
    override val description = "无法攻击。每当你的对手施放一个法术，使你的所有随从获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "这座塔楼下面储藏着数千卷的卷轴，上面记录着全本的《贫瘠之地大家谈》。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5974e52dd0f43010cc449925ebcd8c175e418480f607560aafde7d9d409f9b70.png"
}
