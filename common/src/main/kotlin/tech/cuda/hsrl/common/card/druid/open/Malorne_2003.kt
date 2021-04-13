package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Malorne_2003 : Card() {
    override val id = 2003
    override val name = "玛洛恩"
    override val description = "<b>亡语：</b>将该随从洗入你的牌库。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "玛洛恩之所以讨厌恶魔，是因为他不理解为什么这些又脏又臭的生物会长着和他一样的蹄子。"
    override val artist = "Oliver Chipping"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57261235b53beb123f8ae16fcc169c2f9109e3bfe35d67a3aa68edeab63ab63a.png"
}
