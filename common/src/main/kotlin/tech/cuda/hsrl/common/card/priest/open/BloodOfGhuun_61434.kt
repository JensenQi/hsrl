package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodOfGhuun_61434 : Card() {
    override val id = 61434
    override val name = "戈霍恩之血"
    override val description = "<b>嘲讽</b> 在你的回合结束时，召唤一个你牌库中的随从的5/5复制。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "疗伤未遂，转而成疾；腐蚀至深，绽放之际。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5037c4a9e7f5dc7e49c7b37129a9a2dd3dfd2aee79df190b227d4b35d430146f.png"
}
