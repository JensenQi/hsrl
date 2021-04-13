package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowClone_61156 : Card() {
    override val id = 61156
    override val name = "暗影克隆"
    override val description = "<b>奥秘：</b>在一个随从攻击你的英雄后，召唤一个它的具有<b>潜行</b>的复制。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“你以为你打了脸，但你接下来要对付的是我！也就是你自己！”"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9f1dc4cabad9e305f09a942b17771cd615e16383df9080874e21bf25138a0c5a.png"
}
