package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarletPurifier_2069 : Card() {
    override val id = 2069
    override val name = "血色净化者"
    override val description = "<b>战吼：</b> 对所有具有<b>亡语</b>的随从造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "血色十字军臭名昭著，其领导者们想要通过更名来改善人们对这个组织的看法。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/564257b64b10915497283c61b54e174c4a54e04d7090687ad7f2f01ec223eccf.png"
}
