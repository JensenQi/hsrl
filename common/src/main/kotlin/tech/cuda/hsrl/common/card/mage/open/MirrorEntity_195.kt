package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirrorEntity_195 : Card() {
    override val id = 195
    override val name = "镜像实体"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，召唤一个该随从的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "“你先上。”——“巨兽”克鲁什格尔对他的宠物野猪说道。"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d44868d4fa7a15172f49df50f88e73375afd288f6585dcb7fc0960bd81a2922.png"
}
