package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallOfTheWild_38727 : Card() {
    override val id = 38727
    override val name = "兽群呼唤"
    override val description = "召唤所有三种动物伙伴。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "总有人抱怨使用“动物伙伴”这张牌时，召唤出来的并不是他们想要的。现在好了，三个愿望，一次满足。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81eb56e99eb3c83e6ab2be531107d54ef9e7faa504a25463b0b9e3c83a2a3dfa.png"
}
