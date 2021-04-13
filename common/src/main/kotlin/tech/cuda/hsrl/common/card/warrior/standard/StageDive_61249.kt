package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StageDive_61249 : Card() {
    override val id = 61249
    override val name = "舞台跳水"
    override val description = "抽一张<b>突袭</b>随从牌。<b>腐蚀：</b>使其获得+2/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "舞台跳水是什么东西？我还是喜欢原地复活。"
    override val artist = "J. Cheung & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d785977b426d4bac1453e1df99d43a15ea46f0fe72c99201e0cf1fe5c3745dae.png"
}
