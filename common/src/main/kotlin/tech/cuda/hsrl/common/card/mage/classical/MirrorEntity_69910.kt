package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirrorEntity_69910 : Card() {
    override val id = 69910
    override val name = "镜像实体"
    override val description = "<b>奥秘：</b>当你的对手使用一张随从牌时，召唤一个该随从的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "“你先上。”——“巨兽”克鲁什格尔对他的宠物野猪说道。"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/add2467868679d9d274bec93b11c6878ef1db81ded23828538a307e10050d5b1.png"
}
