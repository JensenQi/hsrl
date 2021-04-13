package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CommandTheIllidari_56841 : Card() {
    override val id = 56841
    override val name = "统率伊利达雷"
    override val description = "召唤六个1/1并具有<b>突袭</b>的伊利达雷。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "你是穴字！你是犬字！你是龙字！你是衣字！你们两个嘛，你们是感叹号！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30b13dd8d47a00d9be11fe8e27e3a5f6364002c034483277f61576e1b9448072.png"
}
