package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirrorEntity_69609 : Card() {
    override val id = 69609
    override val name = "镜像实体"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，召唤一个该随从的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "“你先上。”——“巨兽”克鲁什格尔对他的宠物野猪说道。"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c5f88e35ae370bf9662a9c28eca50657d8881a0b14e8dd20df6b12410968c4c.png"
}
