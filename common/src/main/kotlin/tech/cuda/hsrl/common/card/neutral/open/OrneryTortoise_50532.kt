package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OrneryTortoise_50532 : Card() {
    override val id = 50532
    override val name = "暴躁的巨龟"
    override val description = "<b>战吼：</b>对你的英雄造成5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“达芬奇，我的披萨呢？！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ecff1ef9dd86a6ee8c500fb06819af2f5abd6099f21a4241dc219822e4bbedb.png"
}
