package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MidwayManiac_61206 : Card() {
    override val id = 61206
    override val name = "癫狂的游客"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "马戏团老板恨死他了！但只要一个简单的法术就能破解他的奥秘。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81f4706e48d6dea67943bdddbac50ab7e83c740b752a822e1300f659f32be510.png"
}
