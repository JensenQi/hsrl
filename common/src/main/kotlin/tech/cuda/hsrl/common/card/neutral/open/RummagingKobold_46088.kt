package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RummagingKobold_46088 : Card() {
    override val id = 46088
    override val name = "狗头人拾荒者"
    override val description = "<b>战吼：</b>将你的一把被摧毁的武器置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“断掉的长剑就是全新的短剑。”——狗头人谚语"
    override val artist = "Trent Kaniuga & James Martin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ca7db563fc16acb0a2920cb18db26b7eb4ad3aa8522663f658052a416656309.png"
}
