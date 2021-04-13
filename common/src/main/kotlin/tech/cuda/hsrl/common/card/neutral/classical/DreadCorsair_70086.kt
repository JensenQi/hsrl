package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadCorsair_70086 : Card() {
    override val id = 70086
    override val name = "恐怖海盗"
    override val description = "<b>嘲讽</b> 你的武器每有1点攻击力，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“呀”在海盗的行话中代表“你好啊，有钱人。”"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/922f8885b28ad7fb5fd4b664504fab33ddda68bd592726dec556e100053e1f78.png"
}
