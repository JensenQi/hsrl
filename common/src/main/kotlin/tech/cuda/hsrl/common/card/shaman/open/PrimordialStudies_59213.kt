package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimordialStudies_59213 : Card() {
    override val id = 59213
    override val name = "始生研习"
    override val description = "<b>发现</b>一张<b>法术伤害</b>随从牌。你的下一张<b>法术伤害</b>随从牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "被世人遗忘的秘典，由内而外魔法充盈。神秘作者倾力打造，作者的名字叫……四十尘。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56cad22707429021ec67db2cf06965a326a7db5e08fe2d9e249496e86b2ee3ae.png"
}
