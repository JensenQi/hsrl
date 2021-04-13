package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BananaBuffoon_50386 : Card() {
    override val id = 50386
    override val name = "香蕉小丑"
    override val description = "<b>战吼：</b>将两根香蕉 置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“能给我……你手上的那根香蕉吗。”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93f6897ae07fe59848dd62b897189a456e3e001b477786101a73123fd7e7347c.png"
}
