package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadCorsair_878 : Card() {
    override val id = 878
    override val name = "恐怖海盗"
    override val description = "<b>嘲讽</b> 你的武器每有1点攻击力，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“呀”在海盗的行话中代表“你好啊，有钱人。”"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bb3f17640dbc5b058b911a47f398cd2943b4c263b2dc1c4693435892233410b.png"
}
