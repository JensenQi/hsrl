package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilTotem_54009 : Card() {
    override val id = 54009
    override val name = "怪盗图腾"
    override val description = "在你的回合结束时，将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "当图腾误入歧途之时，人们通常会责怪它的父母。"
    override val artist = "Servando Lupini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7509ccc280a89db763755ff15a06d91c6d0778af7c5b2bcb2188838cd214e9b.png"
}
