package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwiftMessenger_46992 : Card() {
    override val id = 46992
    override val name = "迅捷的信使"
    override val description = "<b>突袭</b> 如果这张牌在你的手牌中，每个回合使其攻击力和生命值互换。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "四条腿送起来就是快！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a133c8adb52020083e94b198e428c57ea7820a62a7b9ad78d7a8508d201616e.png"
}
