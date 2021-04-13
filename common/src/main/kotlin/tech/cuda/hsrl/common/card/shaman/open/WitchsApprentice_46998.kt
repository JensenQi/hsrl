package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchsApprentice_46998 : Card() {
    override val id = 46998
    override val name = "女巫的学徒"
    override val description = "<b>嘲讽，战吼：</b>随机将一张萨满祭司法术牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "到底是女巫变成了青蛙，还是青蛙变成了女巫？"
    override val artist = "Sam Hogg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b2a7d5e5ee5f01176668afdb55b95a14ee62451f6cf3ab7f1041171535a774f.png"
}
