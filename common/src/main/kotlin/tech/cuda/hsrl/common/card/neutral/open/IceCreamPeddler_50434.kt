package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceCreamPeddler_50434 : Card() {
    override val id = 50434
    override val name = "冰淇淋小贩"
    override val description = "<b>战吼：</b>如果你控制一个被<b>冻结</b>的随从，便获得8点护甲值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "我说冰淇淋你说要！冰法冰箱来一套！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71d0e03a7bf284d25ade752094e256d9d3abc5d20b2f85ed38c83d4eaac014c9.png"
}
