package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HenchClanHag_52287 : Card() {
    override val id = 52287
    override val name = "荆棘帮巫婆"
    override val description = "<b>战吼：</b>召唤两个具有全部随从类型的1/1的融合怪。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "荆棘帮是一个注重机会平等的帮派，不论你的某一部位来自哪里，都不会遭到歧视。"
    override val artist = "Christopher Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/864aaf78ce06d43b8a736f40f9d2d2ec08fa7210a002e053e0fc8e50251a28c2.png"
}
