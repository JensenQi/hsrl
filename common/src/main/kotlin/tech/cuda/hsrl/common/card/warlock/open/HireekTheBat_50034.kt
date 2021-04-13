package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HireekTheBat_50034 : Card() {
    override val id = 50034
    override val name = "希里克，蝙蝠之神"
    override val description = "<b>战吼：</b>召唤此随从的复制，直到你的随从数量达到上限。"
    override var cost: Int? = 8
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "除虫喷雾的效果消失了。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ff9480a6e604f84dc6a1b4ff9ae438b9985ca6dbd12304326cb72e69b1df25f.png"
}
