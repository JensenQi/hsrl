package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ProphetVelen_69933 : Card() {
    override val id = 69933
    override val name = "先知维伦"
    override val description = "使你的法术和英雄技能的伤害和治疗效果翻倍。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "他被逐出了他的家园，他的兄弟们都变成了邪恶的主宰......但是除此之外，他好像也没有什么别的可以抱怨的了。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3fcc180d29bf590b3473d764e8d27f57417e2db4f2d68fd9c0871bd2a31147f.png"
}
