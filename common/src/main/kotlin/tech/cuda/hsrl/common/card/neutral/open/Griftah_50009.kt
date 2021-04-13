package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Griftah_50009 : Card() {
    override val id = 50009
    override val name = "格里伏塔"
    override val description = "<b>战吼：</b><b>发现</b>两张牌。随机交给你的对手其中一张。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "只要有格里伏塔在，你的开局就有可能获得幸运币！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4b238cd9cee7e0a55038f40b9a779824c60f6406137ce7a1dc5750b0f2319ce2.png"
}
