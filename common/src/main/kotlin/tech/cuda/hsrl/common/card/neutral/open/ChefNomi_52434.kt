package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChefNomi_52434 : Card() {
    override val id = 52434
    override val name = "大厨诺米"
    override val description = "<b>战吼：</b>如果你的牌库里没有牌，则召唤六个6/6的猛火元素。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他的烹饪技艺真是……熟透了。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/473e2a1b292fe4e60bdce3594d2bd7230a51f0925eb596de203177b3e0709b34.png"
}
