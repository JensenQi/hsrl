package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BolfRamshield_2595 : Card() {
    override val id = 2595
    override val name = "博尔夫·碎盾"
    override val description = "每当你的英雄受到伤害，便会由该随从来承担。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "博尔夫已经是第二次参加锦标赛了。今年他或许有希望，因为他的英雄没能通过预选赛。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c40f6600ed7ed7b791b1e93f89b32eba564a85767d99d39e015725263a955db.png"
}
