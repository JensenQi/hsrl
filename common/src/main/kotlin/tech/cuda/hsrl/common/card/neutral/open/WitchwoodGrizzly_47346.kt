package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchwoodGrizzly_47346 : Card() {
    override val id = 47346
    override val name = "女巫森林灰熊"
    override val description = "<b>嘲讽，战吼：</b> 你的对手每有一张手牌，该随从便失去1点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 12
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "虽然看似有点不现实，但还是有很多人想拿它当坐骑。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d61d60c3cf37f42116a671012c99fcbd1d19fe56ec35d9d1c2b5d799715f9fee.png"
}
