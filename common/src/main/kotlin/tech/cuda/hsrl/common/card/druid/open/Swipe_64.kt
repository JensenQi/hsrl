package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Swipe_64 : Card() {
    override val id = 64
    override val name = "横扫"
    override val description = "对一个敌人造成 4点伤害，并对所有其他敌人 造成 1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "当一只熊向后仰身张开它的前臂时，他就要横扫！...或者拥抱你了。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba9f5516c3cf558a2a38095c2a77c6e9aa1785108fe886bf6804fbe6434e58a0.png"
}
