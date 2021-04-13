package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordFortitude_62872 : Card() {
    override val id = 62872
    override val name = "真言术：韧"
    override val description = "使一个随从获得+3/+5。你手牌中每有一张法术牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "许多年过去了，女祭司仍然没有等到2级的真言术：韧。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca13ebb8223037d702d4949607ea92496442ac75dfcb4b4bb631b69c3b51a7d1.png"
}
