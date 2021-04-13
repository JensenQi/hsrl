package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Swipe_68315 : Card() {
    override val id = 68315
    override val name = "横扫"
    override val description = "对一个敌人造成 4点伤害，并对所有其他敌人 造成 1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "当一只熊向后仰身张开它的前臂时，他就要横扫！...或者拥抱你了。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/af1b014476efe0e2b9e5f8ff77efecd270fa91015425d47f5dc5410c2a81e438.png"
}
