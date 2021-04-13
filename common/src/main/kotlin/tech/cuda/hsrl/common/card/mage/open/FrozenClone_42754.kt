package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrozenClone_42754 : Card() {
    override val id = 42754
    override val name = "寒冰克隆"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，将两张该随从的复制置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "一个好汉两个帮。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e906cf9c12dd3353f45a1e16384fe60de28424c3cf74541b26c81b5728d4b4da.png"
}
