package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StonehillDefender_41243 : Card() {
    override val id = 41243
    override val name = "石丘防御者"
    override val description = "<b>嘲讽，战吼：</b> <b>发现</b>一张具有<b>嘲讽</b>的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它最厉害的武器并非手中的剑盾，而是极尽讽刺挖苦之能事的嘴。"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/278c2342d60822bd271bee174a31f7f0328a74468fc40a3fb7c0896d7a5cee6e.png"
}
