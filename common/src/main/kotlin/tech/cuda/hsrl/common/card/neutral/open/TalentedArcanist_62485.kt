package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TalentedArcanist_62485 : Card() {
    override val id = 62485
    override val name = "精明的奥术师"
    override val description = "<b>战吼：</b>在本回合中，你的下一个法术将获得<b>法术伤害+2</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“嘿伙计，其实你本身的天赋不太够……但也还算有点用。”"
    override val artist = "Yunle Tu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2e545c2efacd94075785df8c15c75a31d03b2364572017a8124ec29dfca1d159.png"
}
